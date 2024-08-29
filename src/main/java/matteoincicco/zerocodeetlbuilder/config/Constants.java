package matteoincicco.zerocodeetlbuilder.config;

// Constants class to hold constant values
public final class Constants {
  // Configs
  public static final String ETL_CONFIG = "etl_config";
  public static final String CONFIGS = "configs";
  public static final String ENV = "env";
  public static final String IAM_ROLE = "aws_iam_role";

  // Input
  public static final String INPUT = "input";
  public static final String S3_SOURCE = "s3_source_bucket";
  public static final String S3_SOURCE_PATH = "s3_source_path";
  public static final String SOURCE_FORMAT = "source_format";
  public static final String LOCAL_SOURCE = "local_source";

  // Output
  public static final String OUTPUT = "output";
  public static final String S3_DESTINATION = "s3_destination_bucket";
  public static final String S3_DESTINATION_PREFIX = "s3_destination_prefix";
  public static final String DESTINATION_FORMAT = "destination_format";
  public static final String LOCAL_DESTINATION = "local_destination";

  // Operations
  public static final String OPERATIONS = "operations";
  public static final String MERGE_TYPE = "merge_type";
  public static final String TRANSFORMATION = "transformationName";

  // Environment
  public static final String LOCAL = "local";
  public static final String DEV = "dev";
  public static final String PRE = "pre";
  public static final String PRO = "pro";

  // Formats
  public static final String JSON = "json";
  public static final String CSV = "csv";
  public static final String PARQUET = "parquet";

  // Transformations
  public static final String SELECT_EXPRESSION = "select_expression";
}
