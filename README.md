# kafka-producer-consumer-example

This Producer-Consumer example is using Kafka as a message broker.

To run this example you need to have Kafka up and running on default port.

There are two services a producer that will publish the message and a consumer that will consume the message. You need to start both services producer will be running on port 8080 and consumer on 8081.

In this example, /api/kafka/publish is being used to publish user information. You can have a look at this endpoint in producer service.
