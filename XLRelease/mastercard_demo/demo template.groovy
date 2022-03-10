// Exported from:        http://pop-os:5516/#/templates/Folder4ca752c385f34418bc4b65a39c8d4340-Releasea03a7dedb74a4891bfe791147c793a82/code
// Release version:      22.1.0-310.113
// Date created:         Thu Mar 10 17:31:58 CET 2022

xlr {
  template('demo template') {
    folder('mastercard_demo')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-03-10T09:00:00+0100')
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