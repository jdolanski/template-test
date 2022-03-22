// Exported from:        http://pop-os:5516/#/templates/FolderSamplesAndTutorials-ReleaseTemplate_sample/code
// Release version:      22.0.2
// Date created:         Tue Mar 22 11:51:49 CET 2022

xlr {
  template('Sample Release Template') {
    folder('Samples & Tutorials')
    variables {
      stringVariable('ACC environment') {
        
      }
      stringVariable('QA environment') {
        
      }
      stringVariable('package') {
        
      }
    }
    description 'Major and minor release template using manual deployments.'
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-03-22T09:00:00+0100')
    phases {
      phase('QA') {
        color '#498500'
        tasks {
          gate('Wait for dependencies') {
            team 'Release mgmt.'
          }
          gate('Version ${package} passes automated tests') {
            description 'Select the proper version to test'
            team 'QA'
            conditions {
              condition('Automated regression tests are green')
              condition('Release notes available')
            }
          }
          manual('Prepare ${QA environment} environment') {
            team 'Dev'
          }
          manual('Deploy ${package} database  to ${QA environment} environment') {
            team 'Dev'
          }
          manual('Deploy ${package} backend  to ${QA environment} environment') {
            team 'Dev'
          }
          manual('Deploy ${package} frontend  to ${QA environment} environment') {
            team 'Dev'
          }
          parallelGroup('Testing') {
            tasks {
              manual('Update test scenarios') {
                team 'QA'
              }
              manual('Regression tests') {
                team 'QA'
              }
            }
          }
          gate('Sign off by QA') {
            team 'QA'
            conditions {
              condition('Notify developers')
              condition('Notify Ops')
            }
          }
          notification('Notify stakeholders of successful QA') {
            team 'QA'
            addresses 'vagrant@localhost'
            subject 'Application ${package} passed QA!'
            body 'The application is available on the ${QA environment} environment.'
          }
        }
      }
      phase('UAT') {
        color '#FF9E49'
        tasks {
          gate('Acceptance environment available') {
            team 'Ops'
            conditions {
              condition('Verify environment availability')
            }
          }
          manual('Prepare ${ACC environment} environment') {
            team 'Ops'
          }
          manual('Install test data on ${ACC environment} environment') {
            team 'Ops'
          }
          manual('Deploy ${package} database to ${ACC environment} environment') {
            team 'Ops'
          }
          manual('Deploy ${package} backend to ${ACC environment} environment') {
            team 'Ops'
          }
          manual('Deploy ${package} frontend to ${ACC environment} environment') {
            team 'Ops'
          }
          notification('Notify QA of installation on ${ACC environment}') {
            team 'QA'
            addresses 'vagrant@localhost'
            subject 'Application ${package} is ready for acceptance testing on ${ACC environment}'
            body 'Have at it!'
          }
          parallelGroup('Testing') {
            tasks {
              manual('Execute performance test') {
                team 'QA'
              }
              manual('Execute UA test') {
                team 'QA'
              }
            }
          }
          gate('Approve') {
            team 'QA'
            conditions {
              condition('Collect all signatures')
            }
          }
        }
      }
      phase('Production') {
        color '#D61F21'
        tasks {
          manual('Go/no go meeting') {
            team 'Release mgmt.'
          }
          manual('Decide on upgrade slot') {
            description 'Block all agendas'
            team 'Release mgmt.'
          }
          gate('Everybody available') {
            team 'Release mgmt.'
            conditions {
              condition('Invitations sent')
              condition('All participants accepted')
              condition('Set start time on Digital.ai Deploy task')
            }
          }
          manual('Run backups') {
            team 'Ops'
          }
          manual('Deploy ${package} database to PROD') {
            team 'Ops'
          }
          manual('Deploy ${package} backend to PROD') {
            team 'Ops'
          }
          manual('Deploy ${package} frontend to PROD') {
            team 'Ops'
          }
          manual('Execute smoke tests') {
            team 'QA'
          }
          parallelGroup('Notification') {
            tasks {
              manual('Alert marketing') {
                team 'Release mgmt.'
              }
              notification('Application ${package} is live!') {
                team 'Release mgmt.'
                addresses 'vagrant@localhost'
                subject 'Application ${package} is live!'
              }
            }
          }
        }
      }
    }
    
  }
}