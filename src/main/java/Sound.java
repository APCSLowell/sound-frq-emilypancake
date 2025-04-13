import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  // to show full authenticity, i will recode everything 
  public int limitAmplitude(int limit)
  {  
    /* to be implemented in part (a) */
    int a=0;
    for(int i = 0; i < samples.length; i++){
      if(samples[i] > limit){
        a++;
      }
      if(samples[i] < -1 * limit){
        a++;
      }
    }
  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  // to show full authenticiy, i will rewrite all my code to show that im not copying from collegeboard
  
  public void trimSilenceFromBeginning() {
    int a = 0;
    while(samples[a] == 0){
      a++;
    } 
    int[]m = new int[samples.length - a];
    for(int i = 0;i<m.length;i++){
      m[i] = samples[i + a];
    }
    samples = m;
  }
}
