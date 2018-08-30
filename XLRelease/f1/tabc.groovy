// Exported from:        http://Jans-MBP:5516/#/templates/Folder2e223c2571cb403bafbd1da1173fbb0d-Release3ae52105ee944b6b898f67d83e3d294d/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Thu Aug 30 11:36:45 CEST 2018

xlr {
  template('tabc') {
    folder('f1')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-08-29T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('b') {
            comments {
              comment {
                text 'new comment'
                author 'admin'
                date Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-08-29T10:01:32+0200')
              }
            }
          }
          manual('a') {
            locked true
          }
          manual('g') {
            
          }
        }
      }
    }
    
  }
}