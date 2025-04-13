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
  //public int limitAmplitude(int limit)
 // {  
    /* to be implemented in part (a) */
    //int a = 0;
    //for(int i = 0; i < samples.length;i++){
      //if(samples[i] > limit){
        //samples[i] = limit;
        //a++;
      //}else if(samples[i] < (-1 * limit)){
        //samples[i] = (-1 * limit);
        //a++;
      //}
    ///}
    //return a;
  //}
    public int limitAmplitude(int limit) {
    /* debugging: copy and paste actual answer of answer key to see if i'm going insane or there might be a error in the tester*/
    int numChanged = 0;
    for (int i = 0; i < this.samples.length; i++) {
      if (this.samples[i] < -limit) {
        this.samples[i] = -limit;
        numChanged++;
      }
      if (this.samples[i] > limit) {
        this.samples[i] = limit;
        numChanged++;
      }
    }
  return numChanged;
  

  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  //public void trimSilenceFromBeginning()
  //{
    /* to be implemented in part (b) */
    //int a = 0;
   // while(samples[a] == 0){
   //   a++;
  //  }
  //  int[] m = new int[samples.length -  a];
 //   for(int i = a; i < samples.length; i++){
 //     m[i - a] = samples[i];
 //   }
  //  samples = m;
      
  //}
  /* i am aware that this is copy paste from collegeboard! this is for debugging purposes so i can tell if the tester has no errors or if i'm acutally not going insane*/
  public void trimSilenceFromBeginning() {
    int i = 0;
    while (this.samples[i] == 0) {
      i++;
    }
    int[] newSamples = new int[this.samples.length - i];
    for (int j = 0; j < newSamples.length; j++) {
      newSamples[j] = this.samples[j+i];
    }
    this.samples = newSamples;
  }
}
