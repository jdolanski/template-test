// Exported from:        http://Jans-MBP:5516/#/templates/Folder8491c205ca70438993ae8a2a6f07bceb-Releaseddb3ca65ffb5441eb16ff26df615f7ef/releasefile
// XL Release version:   0.0.0-SNAPSHOT
// Date created:         Thu May 24 17:16:02 CEST 2018

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
            
          }
          manual('b') {
            
          }
          manual('c') {
            
          }
        }
      }
    }
           
  }
}