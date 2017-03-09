# SproutSocialChallenge

#### Setup Notes
 - You should only need to import this via Git to your Eclipse project and run.

#### Test Running
 - ChallengeTest.java in the tests package should be run as a junit test.
 - Before running, you will need to change the password field in the setUp() method to the valid password for the specified user. 

#### Initial Notes and later TODOs
  1. explicit and implicit waits were not working, so there are many Thread.sleep instances here. Not the best solution, but valid for now until I can resolve the issue with the waits.
  2. add component for composing a new tweet; with send, save and queue options
  3. Using twitter APIs to create tweets for replying tests would be a great helper utility to run before those tests. Need a public website to create an app for proper tokens and keys
