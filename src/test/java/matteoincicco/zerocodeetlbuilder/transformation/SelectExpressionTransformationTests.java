package matteoincicco.zerocodeetlbuilder.transformation;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.junit.Test;

public class SelectExpressionTransformationTests implements SparkSessionTestWrapper {

  @Test
  public void transformSelectExpression() {
    CommonTransformationConfig config = new CommonTransformationConfig("hello world");
    SelectExpressionTransformation selectExpressionTransformation =
        new SelectExpressionTransformation();
    Dataset<Row> dummy_df_1 = spark.read().json("src/test/java/test_files/dummy_df_1.json");
    dummy_df_1.printSchema();
    dummy_df_1.show();

    Dataset<Row> df_transformed = selectExpressionTransformation.transform(dummy_df_1, config);

    // TODO: Finish Tests once SelectExpressionTransformation has been implemented for real
    assert df_transformed.count() == 2;
  }
}
