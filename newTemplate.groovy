// Exported from:        http://Jans-MBP:5516/#/templates/Releasee8d8f4aeee1045a59a1349ebfb9ca32a/releasefile
// XL Release version:   0.0.0-SNAPSHOT
// Date created:         Mon Jun 04 10:06:35 CEST 2018

def scmConnectorConfig1 = 'PLEASE IMPLEMENT THIS METHOD'

xlr {
  template('newTemplate') {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-06-04T09:00:00+0200')
    scmConnectorConfig scmConnectorConfig1
    phases {
      phase('New Phase') {
        tasks {
          manual('a') {
            
          }
          manual('b') {
            
          }
          manual('v') {
            
          }
          manual('r#') {
            
          }
        }
      }
    }
    teams {
      team('Release Admin') {
        permissions 'release#edit', 'release#lock_task', 'release#start', 'release#reassign_task', 'release#edit_blackout', 'template#view', 'release#edit_security', 'release#abort', 'release#view', 'release#edit_task'
      }
      team('Template Owner') {
        members 'admin'
        permissions 'template#edit', 'template#lock_task', 'template#view', 'template#edit_triggers', 'template#edit_security', 'template#create_release'
      }
    }
  }
}