// Exported from:        http://Jans-MBP:5516/#/templates/Folderfca5a290e9f4c2f8fb1a74c15e9dadb-Folderfb428b41efd6433e85a92dee0cc1faf1-Release130663c0ba7485c9ea30060a7bf068e/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Fri Jun 15 12:02:28 CEST 2018

xlr {
  template('template') {
    folder('folder1/folder2')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-06-15T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('a') {
            failureHandler 'if True:\n' +
                           '  return \'true\''
            taskFailureHandlerEnabled true
            taskRecoverOp com.xebialabs.xlrelease.domain.recover.TaskRecoverOp.RUN_SCRIPT
          }
          manual('b') {
            taskFailureHandlerEnabled true
            taskRecoverOp com.xebialabs.xlrelease.domain.recover.TaskRecoverOp.SKIP_TASK
          }
          manual('c') {
            
          }
        }
      }
    }
    
  }
}