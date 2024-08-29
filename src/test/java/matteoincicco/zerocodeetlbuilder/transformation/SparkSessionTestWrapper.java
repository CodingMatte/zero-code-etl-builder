package matteoincicco.zerocodeetlbuilder.transformation;

import org.apache.spark.sql.SparkSession;

public interface SparkSessionTestWrapper {

  SparkSession spark =
      SparkSession.builder().appName("SparkSessionTestWrapper").master("local[*]").getOrCreate();
}
