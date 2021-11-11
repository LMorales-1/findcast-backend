package operation.findcastbackend;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import operation.findcastbackend.controller.EpisodeController;
import operation.findcastbackend.controller.PodcastController;

@SpringBootTest
class SmokeTest {

	@Autowired
	private PodcastController pController;

	@Autowired
	private EpisodeController eController;

	@Test
	void contextLoads() {
		assertThat(pController).isNotNull();
		assertThat(eController).isNotNull();
	}

}
