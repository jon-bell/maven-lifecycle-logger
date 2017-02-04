package net.jonbell.maven.logger;

import org.apache.maven.AbstractMavenLifecycleParticipant;
import org.apache.maven.MavenExecutionException;
import org.apache.maven.execution.ExecutionListener;
import org.apache.maven.execution.MavenSession;
import org.codehaus.plexus.component.annotations.Component;
import org.codehaus.plexus.component.annotations.Requirement;

@Component( role = AbstractMavenLifecycleParticipant.class, hint = "test-logger")
public class LoggerLifecycleParticipant extends AbstractMavenLifecycleParticipant
{
	@Requirement(role = ExecutionListener.class, hint="test-logger")
	private LifecycleLogger logger;


    @Override
    public void afterProjectsRead( MavenSession session )
        throws MavenExecutionException
    {
    	logger.configure(session.getRequest().getExecutionListener());
    	session.getRequest().setExecutionListener(logger);
    }
    

}