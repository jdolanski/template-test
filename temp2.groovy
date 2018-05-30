// Exported from:        http://Jans-MacBook-Pro.local:5516/#/templates/Released4e27b7958464d9db86eefbbc7872cbc/releasefile
// XL Release version:   0.0.0-SNAPSHOT
// Date created:         Wed May 30 16:59:06 CEST 2018

def scmConnectorConfig1 = 'PLEASE IMPLEMENT THIS METHOD'

xlr {
  template('Template1Test') {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-05-30T09:00:00+0200')
    scmConnectorConfig scmConnectorConfig1
    phases {
      phase('New Phase') {
        tasks {
          manual('abc') {
            
          }
          createRelease('test') {
            
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