// Exported from:        http://Jans-MBP:5516/#/templates/Release5f1bb9f4e4a24f318c22269140a3d622/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Thu Aug 02 09:55:18 CEST 2018

xlr {
  template('templatel (1)') {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-08-02T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('a') {
            
          }
          manual('fdsa') {
            
          }
          manual('f') {
            
          }
          manual('saf') {
            
          }
          manual('sa') {
            
          }
        }
      }
    }
    teams {
      team('Template Owner') {
        members 'admin'
        permissions 'template#edit', 'template#lock_task', 'template#view', 'template#edit_triggers', 'template#edit_security', 'template#create_release', 'template#edit_failure_handler'
      }
      team('Release Admin') {
        permissions 'release#edit', 'release#lock_task', 'release#start', 'release#reassign_task', 'release#edit_blackout', 'template#view', 'release#edit_failure_handler', 'release#edit_security', 'release#abort', 'release#view', 'release#edit_task'
      }
    }
  }
}