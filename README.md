Big Data Analysis of Global Database of Events, Language and Tone (GDELT)

Global Database of Events, Language, and Tone - It is shared on BigQuery, a restful service that enables interactive analysis of massively large datasets working in conjunction with Google Cloud Storage. It comprises of a quarter billion events from the last 30 years. It indexes material news articles from diverse worldwide publications. It talks about how social systems are operating. 
GDELT creates a global catalog of human disaster likes theft , riots, assault etc based on geo-location, actors, categories, intensity etc. It monitors the world's broadcast, print, and web news to collect data. It is a realtime network diagram and database of global human society. The main idea behind Analysis of the GDELT dataset was to analyze the crime trends and its fluctuations in the U.S using MapReduce and Hive technologies.

Directory Structure:

gdelt_proj_mr1: Source folder of the MapReduce I program.
gdelt_proj_mr2: Source folder of the MapReduce II program.
data0000000000000000.csv: The Custom Dataset pulled out via BigQuery.
gdelt_mr1.jar: Jar file generated for MapReduce I program.
gdelt_mr2.jar: Jar file generated for MapReduce II program.
Hive_Queries.txt: List of all the hive queries.