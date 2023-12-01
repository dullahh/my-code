#define trigPin 10
#define echoPin 13

float duration, distance;
int LED1 = 11;
int LED2 = 12;
void setup() {
  Serial.begin (9600);
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  pinMode(LED1, OUTPUT);
}

void loop() {
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
  

  duration = pulseIn(echoPin, HIGH);

  distance = (duration / 2) * 0.0343;
  if (distance <= 50) {
    digitalWrite(LED1,HIGH);
  }
  else {
    digitalWrite(LED1,LOW);
  }

  if (distance >= 50 and distance <= 80) {
    digitalWrite(LED2,HIGH);
  } 
  else {
    digitalWrite(LED2,LOW);
  }
  
  Serial.print("Distance = ");
  if (distance >= 400 ||distance <= 2) {
    Serial.println("Out of range");
  }
  else {
    Serial.print(distance);
    Serial.println(" cm");
    delay(500);
  }
  delay(500);
  
 
}

 
