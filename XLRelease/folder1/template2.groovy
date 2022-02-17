// Exported from:        http://pop-os:5516/#/templates/Folder8397fc322699475e85343bc7f8728489-Releasefe14027630c44d3daabc6b88078f4786/code
// Release version:      22.0.0-20211220-123974
// Date created:         Thu Feb 17 18:55:43 CET 2022

xlr {
  template('template2') {
    folder('folder1')
    variables {
      listBoxVariable('testlb') {
        possibleValues 'a', 'b', 'c'
        value 'a'
      }
    }
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-12-20T09:00:00+0100')
    dueDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-12-20T10:00:00+0100')
    scriptUsername 'admin'
    phases {
      phase('phase1 new edit') {
        
      }
    }
    
  }
}