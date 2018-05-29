// Exported from:        http://Jans-MBP:5516/#/templates/Folderd127abc7ac4d43d39b1d234cf841ed17-Folder3c9bdc3c50764cf596541f6132cd6917-Releasea7826c85e66948c5a052d3289bd0037a/releasefile
// XL Release version:   0.0.0-SNAPSHOT
// Date created:         Wed May 16 13:39:39 CEST 2018

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
  release('template001 (4)') {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-05-14T09:00:00+0200')
    riskProfile riskProfile1
    phases {
      phase('New Phase') {
        color '#0099CC'
        tasks {
          manual('a') {
            
          }
          custom('c') {
            script {
              type 'jenkins.Build'
              jenkinsServer jenkinsServer1
              password '{b64}PBUt5/G14nXY6tSNEDucnQ=='
            }
          }
        }
      }
    }
  }
}