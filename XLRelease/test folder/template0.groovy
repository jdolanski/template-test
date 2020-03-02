// Exported from:        http://Jans-MBP:5516/#/templates/Folderd7431866793d452789cc5b8b1a28d238-Release8e2815331a7a40ddb9fb5e0742844321/releasefile
// XL Release version:   9.5.0-SNAPSHOT
// Date created:         Mon Mar 02 14:43:38 CET 2020

xlr {
  template('template0') {
    folder('test folder')
    variables {
      stringVariable('var') {
        
      }
    }
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2020-02-28T09:00:00+0100')
    phases {
      phase('New Phase') {
        tasks {
          manual('a') {
            
          }
          manual('b') {
            attachments {
              attachment("sql:Attachmentece714abd1f34d95afa3ef9e63952e0a") {
                filename "attachments/Attachmentece714abd1f34d95afa3ef9e63952e0a-8OPcvwacmF8HLf1TlilRhGvaXWX2KC-ENUhGl6WdAr8.jpg"
              }
            }
          }
          manual('v') {
            
          }
          manual(']') {
            
          }
        }
      }
    }
    
  }
}