// Exported from:        http://Jans-MBP:5516/#/templates/Folderc203cd04ff5e46f3a39097c7b65edcde-Releaseaa03de39df4a4879b82cbc71d5b05d3f/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Thu Jul 26 11:33:11 CEST 2018

xlr {
  template('test') {
    folder('a')
    variables {
      listBoxVariable('testvar') {
        // no DSL renderer found for test.TestValueProvider
      }
      stringVariable('var2') {
        
      }
    }
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-07-24T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('a') {
            
          }
          manual('a') {
            
          }
          manual('b') {
            
          }
        }
      }
    }
    releaseTriggers {
      timeSchedule('trig1') {
        releaseTitle 'releasefromTrig'
        variables {
          listBoxVariable('testvar') {
            value '4'
          }
          stringVariable('var2') {
            
          }
        }
        pollType com.xebialabs.xlrelease.domain.PollType.REPEAT
        periodicity '40'
        enabled false
      }
    }
    
  }
}