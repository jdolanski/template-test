// Exported from:        http://Jans-MBP.home:5516/#/templates/Folder53b466ad217444ea9d2c5ae5fb7ae774-Releasebd5af2e96a1641709b40bfdb6c65135f/code
// Release version:      9.7.0-SNAPSHOT
// Date created:         Wed Feb 24 00:25:06 CET 2021

xlr {
  template('testing template') {
    folder('testing config variables')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2021-02-23T09:00:00+0100')
    phases {
      phase('New Phase') {
        tasks {
          custom('test') {
            script {
              type 'test.Lookup'
              jiraServer 'fakejira'
              project 'm'
            }
          }
        }
      }
    }
    extensions {
      dashboard('Dashboard') {
        parentId 'Applications/Folder53b466ad217444ea9d2c5ae5fb7ae774/Releasebd5af2e96a1641709b40bfdb6c65135f'
        owner 'admin'
        tiles {
          releaseProgressTile('Release progress') {
            
          }
          releaseSummaryTile('Release summary') {
            
          }
          resourceUsageTile('Resource usage') {
            
          }
          timelineTile('Release timeline') {
            
          }
          releaseHealthTile('Release health') {
            
          }
        }
      }
    }
    
  }
}