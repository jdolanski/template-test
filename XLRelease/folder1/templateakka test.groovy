// Exported from:        http://Jans-MBP:5516/#/templates/Folder89f25375db604d69956f790eaeb97481-Release901d1a5be9b1446b83122b1e958ba923/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Thu Aug 23 09:24:52 CEST 2018

xlr {
  template('templateakka test') {
    folder('folder1')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-08-23T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('a') {
            
          }
          manual('v') {
            
          }
        }
      }
    }
    
  }
}