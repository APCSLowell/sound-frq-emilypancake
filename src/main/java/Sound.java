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
  public int limitAmplitude(int limit)
  {  
    /* to be implemented in part (a) */
    int a = 0;
    for(int i = 0; i < samples.length;i++){
      if(samples[i] > limit){
        samples[i] = limit;
        a++;
      }else if(samples[i] < (-1 * limit)){
        samples[i] = (-1 * limit);
        a++;
      }
    }
    System.out.println(samples)
    System.out.println(a)
    return a;

  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
    /* to be implemented in part (b) */
    int a = 0;
    int j = 0;
    while(j == 0 && a < samples.length){
      if(samples[a] != 0){
        j++;
      }else{
        a++;
      }
    }
    int[] m = new int[samples.length -  a];
    int c = 0;
    for(int i = a; i < samples.length; i++){
      m[c] = samples[i];
      c++;
    }
    samples = m;
      
  }
}
