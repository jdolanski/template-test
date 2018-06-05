// Exported from:        http://Jans-MBP:5516/#/templates/Release60214d2073f44ff689aec2cb10b46d08/releasefile
// XL Release version:   0.0.0-SNAPSHOT
// Date created:         Tue Jun 05 12:21:51 CEST 2018

def scmConnectorConfig1 = 'PLEASE IMPLEMENT THIS METHOD'

xlr {
  template('newTemp') {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-06-04T09:00:00+0200')
    scmConnectorConfig scmConnectorConfig1
    phases {
      phase('New Phase') {
        tasks {
          manual('afda') {
            attachments {
              attachment("sql:Attachment301bd419048f48c0b43d8ccf8bdfba1e") {
                filename "attachments/Attachment301bd419048f48c0b43d8ccf8bdfba1e-image-1.png"
              }
              attachment("sql:Attachment7c971cb2ddd64a4aada33a5212005af5") {
                filename "attachments/Attachment7c971cb2ddd64a4aada33a5212005af5-lovro.jpg"
              }
            }
            locked true
          }
          manual('fda') {
            
          }
          gate('fd') {
            
          }
          manual('f') {
            
          }
        }
      }
    }
    teams {
      team('Template Owner') {
        members 'admin'
        permissions 'template#edit', 'template#lock_task', 'template#view', 'template#edit_triggers', 'template#edit_security', 'template#create_release'
      }
      team('Release Admin') {
        permissions 'release#edit', 'release#lock_task', 'release#start', 'release#reassign_task', 'release#edit_blackout', 'template#view', 'release#edit_security', 'release#abort', 'release#view', 'release#edit_task'
      }
    }
  }
}