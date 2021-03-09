package com.luxoft.junit5.assumptions.environment;

public class TestsEnvironment {
    private final JavaSpecification javaSpecification;
    private final OperationSystem operationSystem;

    public TestsEnvironment(JavaSpecification javaSpecification, OperationSystem operationSystem) {
        this.javaSpecification = javaSpecification;
        this.operationSystem = operationSystem;
    }

    public boolean isWindows() {
        return operationSystem.name().contains( "Windows" );
    }

    public String aJavaVersion() {
        return javaSpecification.version();
    }

    public boolean isAmd64Architecture() {
        return operationSystem.architecture().equals( "amd64" );
    }
}
