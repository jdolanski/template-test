// Exported from:        http://Jans-MBP:5516/#/templates/Folder89f25375db604d69956f790eaeb97481-Release9f090185ff4647619d2cd6e9ce68d64b/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Fri Aug 24 11:10:20 CEST 2018

xlr {
  template('newwww') {
    folder('folder1')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-08-23T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('faafa') {
            attachments {
              attachment("sql:Attachment602022c0fa0e494a81cdfc0742af2587") {
                filename "attachments/Attachment602022c0fa0e494a81cdfc0742af2587-image-10.png"
              }
              attachment("sql:Attachment31cf2ba9b1574db9a22c4a748d1789f3") {
                filename "attachments/Attachment31cf2ba9b1574db9a22c4a748d1789f3-image-5.png"
              }
              attachment("sql:Attachment4af03f8d4ad44b918ce9eef9eaca0227") {
                filename "attachments/Attachment4af03f8d4ad44b918ce9eef9eaca0227-output.dat"
              }
            }
          }
        }
      }
    }
    
  }
}