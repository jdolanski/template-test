// Exported from:        http://Jans-MBP:5516/#/templates/Folder8491c205ca70438993ae8a2a6f07bceb-Releasebe0f2fddc7fa470792a32e514d339d71/releasefile
// XL Release version:   0.0.0-SNAPSHOT
// Date created:         Wed May 23 14:54:19 CEST 2018

def server(type, title) {
    def cis = configurationApi.searchByTypeAndTitle(type, title)
    if (cis.isEmpty()) {
        throw new RuntimeException("No CI found for the type '${type}' and title '${title}'")
    }
    if (cis.size() > 1) {
        throw new RuntimeException("More than one CI found for the type '${type}' and title '${title}'")
    }
    cis.get(0)
}

def riskProfile(title) {
    riskApi.getRiskProfileByTitle(title)
}

def riskProfile1 = riskProfile('riskprofile2')
def jenkinsServer1 = server('jenkins.Server','jan/jenkins2')

xlr {
  template('jenkinstemplate') {
    folder('fdasfas')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-05-16T09:00:00+0200')
    riskProfile riskProfile1
    phases {
      phase('New Phase') {
        tasks {
          custom('a') {
            script {
              type 'jenkins.Build'
              jenkinsServer jenkinsServer1
              jobName 'abc'
            }
          }
          manual('v') {
            
          }
        }
      }
    }
           
  }
}