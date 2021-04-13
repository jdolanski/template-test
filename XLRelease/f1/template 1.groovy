// Exported from:        http://pop-os:5516/#/templates/Folderf37d584a49ea4221b50fef0d7951c9b1-Release6f28241b2c284d3988aa08adf36ee836/code
// Release version:      10.1.0-SNAPSHOT
// Date created:         Tue Apr 13 14:30:48 CEST 2021

xlr {
  template('template 1') {
    folder('f1')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-04-13T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('a') {
            
          }
        }
      }
    }
    
  }
}