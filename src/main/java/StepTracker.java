import java.util.ArrayList;
public class StepTracker
{
 private ArrayList <Integer> steps;
 private int limit;
 public StepTracker(int setlimits){
  limit = setlimits;
 }
 public int activeDays(){
  int count = 0;
  for(int i = 0; i < steps.size(); i++){
   if(steps.get(i) >= limit){
    count++;
   }
   return count;
  }
 }
  public double averageSteps(){
   int sum = 0;
   for(int i = 0; i < steps.size(); i++){
    sum += steps.get(i);
   }
   return sum/steps.size();
  }
  public int addDailySteps(int step){
   steps.add(step);
  }
}
