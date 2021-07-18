package zxf.workflow.system;

public interface ProcessorFactory {
    Processor createProcessor(String name);
}
