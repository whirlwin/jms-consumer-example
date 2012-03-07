# JMS consumer example

## Requirements
- Eclipse IDE for Java EE Developers (or similar)
- GlassFish


## Instuctions

1. Clone this repository to your computer.

2. Import as a Maven project into Eclipse.

3. Run `mvn install`.

4. Start GlassFish: `asadmin start-domain`

5. Open `localhost:4848`.

6. Go to:
`Resources` -> `JMS Resources` -> `Connection Factories`.
Select `New`.
Set `Pool Name` = `jms/QueueConnectionFactory`.
Set `Resource Type` = `javax.jms.QueueConnectionFactory`.
Locate and click `OK`.

7. Go to:
`Resources` -> `JMS Resources` -> `Destination Resources`.
Select `New`.
Set `JNDI Name` = `jms/JMSConsumer`.
Set `Physical Destination Name` = `JMSConsumer`.
Locate and click `OK`

8. Go to:
`Applications`.
Select `Deploy...`.
Select `Choose File`
Find and select the JAR generated (`path/to/project/target/jmsconsumer.jar`).
Locate and click `OK`.

## What's next?

Head over to [my other repository]
(https://github.com/whirlwin/jms-producer-example)
to check out how to set up an application (producer) that
tests the consumer.
