// Exported from:        http://Jans-MBP:5516/#/templates/Release3e2fac0a0e2a48858f98d0427c976b39/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Thu Aug 02 09:53:30 CEST 2018

xlr {
  template('templatel') {
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
      team('Release Admin') {
        permissions 'release#edit', 'release#lock_task', 'release#start', 'release#reassign_task', 'release#edit_blackout', 'template#view', 'release#edit_failure_handler', 'release#edit_security', 'release#abort', 'release#view', 'release#edit_task'
      }
      team('Template Owner') {
        members 'admin'
        permissions 'template#edit', 'template#lock_task', 'template#view', 'template#edit_triggers', 'template#edit_security', 'template#create_release', 'template#edit_failure_handler'
      }
    }
  }
}