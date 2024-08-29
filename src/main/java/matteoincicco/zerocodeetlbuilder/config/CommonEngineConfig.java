package matteoincicco.zerocodeetlbuilder.config;

public class CommonEngineConfig extends EngineConfig {
  private final String env;
  private final String sourceFormat;
  private final String destinationFormat;
  private final String mergeType;
  private final String transformationName;
  private final String awsKey;
  private final String awsSecret;
  private final String awsIamRole;
  private final String s3SourceBucket;
  private final String s3SourcePath;
  private final String localSource;
  private final String s3DestinationBucket;
  private final String s3DestinationPrefix;
  private final String localDestination;

  public CommonEngineConfig(
      String env,
      String sourceFormat,
      String destinationFormat,
      String mergeType,
      String transformationName,
      String awsKey,
      String awsSecret,
      String awsIamRole,
      String s3SourceBucket,
      String s3SourcePath,
      String localSource,
      String s3DestinationBucket,
      String s3DestinationPrefix,
      String localDestination) {

    if (localSource == null
        && (s3SourceBucket == null
            || s3SourcePath == null
            || awsIamRole == null
            || awsSecret == null
            || awsKey == null)) {
      throw new IllegalArgumentException(
          "At least one of 'localSource' or AWS S3 configs "
              + "(s3SourceBucket, s3SourcePath, awsIamRole, awsSecret, awsKey) "
              + "must be provided.");
    }

    if (localDestination == null
        && (s3DestinationBucket == null
            || s3DestinationPrefix == null
            || awsIamRole == null
            || awsSecret == null
            || awsKey == null)) {
      throw new IllegalArgumentException(
          "At least one of 'localDestination' or AWS S3 configs "
              + "(s3DestinationBucket, s3DestinationPrefix, awsIamRole, awsSecret, awsKey) "
              + "must be provided.");
    }

    this.env = env;
    this.sourceFormat = sourceFormat;
    this.destinationFormat = destinationFormat;
    this.mergeType = mergeType;
    this.transformationName = transformationName;
    this.awsKey = awsKey;
    this.awsSecret = awsSecret;
    this.awsIamRole = awsIamRole;
    this.s3SourceBucket = s3SourceBucket;
    this.s3SourcePath = s3SourcePath;
    this.localSource = localSource;
    this.s3DestinationBucket = s3DestinationBucket;
    this.s3DestinationPrefix = s3DestinationPrefix;
    this.localDestination = localDestination;
  }

  // Getters
  public String getEnv() {
    return env;
  }

  public String getSourceFormat() {
    return sourceFormat;
  }

  public String getDestinationFormat() {
    return destinationFormat;
  }

  public String getMergeType() {
    return mergeType;
  }

  public String getTransformationName() {
    return transformationName;
  }

  public String getAwsKey() {
    return awsKey;
  }

  public String getAwsSecret() {
    return awsSecret;
  }

  public String getAwsIamRole() {
    return awsIamRole;
  }

  public String getS3SourceBucket() {
    return s3SourceBucket;
  }

  public String getS3SourcePath() {
    return s3SourcePath;
  }

  public String getLocalSource() {
    return localSource;
  }

  public String getS3DestinationBucket() {
    return s3DestinationBucket;
  }

  public String getS3DestinationPrefix() {
    return s3DestinationPrefix;
  }

  public String getLocalDestination() {
    return localDestination;
  }
}
