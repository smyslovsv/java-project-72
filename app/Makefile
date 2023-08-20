build:
	./gradlew clean build

clean:
	./gradlew clean

test:
	./gradlew test

start:
	APP_ENV=development ./gradlew run

install:
	./gradlew install

start-dist:
	APP_ENV=production ./build/install/java-javalin-blog/bin/java-javalin-blog

report:
	./gradlew jacocoTestReport

lint:
	./gradlew checkstyleMain checkstyleTest

generate-migrations:
	./gradlew generateMigrations

.PHONY: build