// Exported from:        http://Jans-MBP:5516/#/templates/Folder8491c205ca70438993ae8a2a6f07bceb-Releaseddb3ca65ffb5441eb16ff26df615f7ef/releasefile
// XL Release version:   0.0.0-SNAPSHOT
// Date created:         Tue May 29 14:45:42 CEST 2018

def scmConnectorConfig1 = 'PLEASE IMPLEMENT THIS METHOD'

xlr {
  template('newTemplate') {
    folder('fdasfas')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-05-24T09:00:00+0200')
    scmConnectorConfig scmConnectorConfig1
    phases {
      phase('New Phase') {
        tasks {
          manual('a') {
            attachments {
              attachment("sql:Attachmente8fe10b8ce434908acc32c15bcc9dd7f") {
                filename "attachments/Attachmente8fe10b8ce434908acc32c15bcc9dd7f-image.png"
              }
            }
          }
          manual('b') {
            
          }
          manual('c') {
            attachments {
              attachment("sql:Attachment795d541edb9f42a2807d7bf506ca43dd") {
                filename "attachments/Attachment795d541edb9f42a2807d7bf506ca43dd-lovro.jpg"
              }
            }
          }
        }
      }
    }
           
  }
}