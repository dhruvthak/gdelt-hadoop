import java.io.IOException;
import java.util.Iterator;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Gdelt_Reduce extends Reducer<Text, Text, Text, String> {

  @Override
  public void reduce(Text key, Iterable<Text> values, Context context)
      throws IOException, InterruptedException {
	  
	  Iterator <Text> records = values.iterator();
	  int i = 0;
	  while(records.hasNext()){
		  records.next();
		  i++;
	  }
	  context.write(key, ""+i);
  }
}