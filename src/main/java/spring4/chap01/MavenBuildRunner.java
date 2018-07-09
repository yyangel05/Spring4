package spring4.chap01;

import java.util.List;

public class MavenBuildRunner implements BuildRunner {
	
	private String mavenPath;

	@Override
	public void build(List<String> srcDirs, String binDir) {
		// TODO Auto-generated method stub
		
		String info = "메이븐 경로 : " + mavenPath + "\n";
		for(String srcDir : srcDirs)
			info += "소스 경로 : " + srcDir + "\n";
		info += "클래스파일 경로 : " + binDir + "\n";
		
		System.out.printf("MavenBuildRunner.build()실행 \n%s", info);
				
	}
	
	public void setMavenPath(String mavenPath) {
		this.mavenPath = mavenPath;
	}

}

/*
 	//실행결과
MavenBuildRunner.build()실행 
메이븐 경로 : c://apache-maven-3.1.1
소스 경로 : src
소스 경로 : srcResource
클래스파일 경로 : bin

 */