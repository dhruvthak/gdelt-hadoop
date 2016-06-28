import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Gdelt_Reduce extends Reducer<Text, Text, Text, ArrayList<String>> {

  @Override
  public void reduce(Text key, Iterable<Text> values, Context context)
      throws IOException, InterruptedException {
	  
	  Iterator <Text> records = values.iterator();
	  ArrayList<String> crime_type = new ArrayList<String>();
	  while(records.hasNext()){
		  String t[] = records.next().toString().split(":");
		  crime_type.add(t[0]);
	  }
	  
	  ArrayList<String> uniq_ctype = new ArrayList<String>();
	  
	  for(String d :crime_type){
		if(uniq_ctype.contains(d)){
			
		}
		else{
			uniq_ctype.add(d);
		}
	  }
	  ArrayList<String> out = new ArrayList<String>();
	  for(String d :uniq_ctype){
		    out.add(d+":"+Collections.frequency(crime_type, d));
		  }
	  Collections.sort(out);
	  context.write(key, out);
  }
}