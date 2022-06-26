# springboot-aad-demo

This is a demo project, the guide for use correctly Spring Security and Azure Active Directory.

which inspired by the repos:

[azure-spring-boot-sample](https://github.com/Azure-Samples/azure-spring-boot-samples)

[spring-active-directory](https://github.com/jdubois/spring-active-directory)

# Initialize the env viable

export DATABASE_PASSWORD="xxxxxx"

export AD_CLIENT_ID="xxxxxxx"

export AD_TENANT_ID="xxxxxxxxx"

export AD_CLIENT_SECRET=xxxxxxxxxxxxxxxx

# Run the app

./mvnw spring-boot:run

# Verify the access

Using chrome to open: http://localhost:8080

Using chrome to open: http://localhost:8080/approle

# Contribute

Feel free to open issues and pull requests. Any feedback is highly appreciated!
