// Exported from:        http://Jans-MacBook-Pro.local:5516/#/templates/Folderab54501912f4292b81555a88cf5ad2a-Release4fd34e59cb824e06b17627d425ba103a/releasefile
// XL Release version:   8.1.0-rc.4
// Date created:         Mon Jun 18 16:03:22 CEST 2018

xlr {
  template('newTemplate') {
    folder('newFolder')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-06-18T09:00:00+0200')
    realFlagStatus com.xebialabs.xlrelease.domain.status.FlagStatus.ATTENTION_NEEDED
    phases {
      phase('New Phase') {
        tasks {
          manual('a') {
            locked true
          }
          manual('b') {
            flagStatus com.xebialabs.xlrelease.domain.status.FlagStatus.ATTENTION_NEEDED
          }
          manual('c') {
            locked false
          }
        }
      }
    }
    
  }
}
