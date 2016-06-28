import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class Gdelt_Map extends Mapper<LongWritable, Text, Text, Text> {
	
	private Text month_year = new Text();
	private Text area = new Text();
	private Text crime_type = new Text(); 
	
  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {
	  
	  String line = value.toString();
	  String[] records = line.split(",");
	  
	  month_year.set(records[0]);
	  area.set(records[1]);
	  crime_type.set(records[2]);
	  
	  context.write(month_year,new Text(crime_type + ":" + new IntWritable(1)));
  }
}
