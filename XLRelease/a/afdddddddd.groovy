// Exported from:        http://Jans-MBP:5516/#/templates/Folder894a2e2bf84e4184b6e984fa9e86dc1c-Releaseda6d2734d90e435693c32835f4f8b3c0/releasefile
// XL Release version:   9.6.0-alpha.90
// Date created:         Tue Feb 25 15:11:30 CET 2020

xlr {
  template('afdddddddd') {
    folder('a')
    variables {
      dateVariable('date') {
        
      }
    }
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2020-02-25T09:00:00+0100')
    realFlagStatus com.xebialabs.xlrelease.domain.status.FlagStatus.ATTENTION_NEEDED
    phases {
      phase('New Phase') {
        tasks {
          custom('a') {
            scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2020-02-26T09:45:00+0100')
            flagStatus com.xebialabs.xlrelease.domain.status.FlagStatus.ATTENTION_NEEDED
            comments {
              comment {
                text 'jgerjlfsmkls]'
                author 'admin'
                date Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2020-02-25T14:38:05+0100')
                creationDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2020-02-25T14:38:05+0100')
              }
            }
            attachments {
              attachment("sql:Attachment5707d44e80564e26958eb44e7332126e") {
                filename "attachments/Attachment5707d44e80564e26958eb44e7332126e-Copy_Tasks_from_Template_into_Release.txt"
              }
            }
            script {
              type 'checkmarx.checkOsaCompliance'
              
            }
          }
        }
      }
    }
    
  }
}