// Exported from:        http://Jans-MacBook-Pro.local:5516/#/templates/Folder3b39231f69db411f9ad5e63577d8c01b-Releasea65b7e8131543318bc97da8ef6474d1/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Fri Jul 20 14:34:03 CEST 2018

xlr {
  template('githubTemplate') {
    folder('scmtemplates')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-07-20T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('a') {
            
          }
          manual('b') {
            attachments {
              attachment("sql:Attachment123e1f248b53481dab7023a412241acf") {
                filename "attachments/Attachment123e1f248b53481dab7023a412241acf-image.png"
              }
            }
          }
        }
      }
    }
    
  }
}