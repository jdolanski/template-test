// Exported from:        http://Jans-MacBook-Pro.local:5516/#/templates/Folderab54501912f4292b81555a88cf5ad2a-Release4fd34e59cb824e06b17627d425ba103a/releasefile
// XL Release version:   8.1.0-rc.4
// Date created:         Mon Jun 18 16:01:03 CEST 2018

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
            attachments {
              attachment("sql:Attachment38ad9adc567546148c34d5a2be854728") {
                filename "attachments/Attachment38ad9adc567546148c34d5a2be854728-image-10.png"
              }
            }
            locked true
          }
          manual('c') {
            
          }
        }
      }
    }
    
  }
}