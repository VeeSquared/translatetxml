package com.translatetxml.command;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;

public class SourceFileCommand extends Command {
	private static final String OPT_SHORT_DESC = "f";
	private static final String OPT_LONG_DESC = "file";
	private static final String OPT_DESC = "Path to source TXML file";

	@Override
	public String getName() {
		return OPT_LONG_DESC;
	}

	@Override
	public String getDescription() {
		return OPT_DESC;
	}

	@Override
	public Option getOptions() {		
		return Option.builder(OPT_SHORT_DESC)
                .longOpt(OPT_LONG_DESC)
                .hasArgs()
                .required(true)
                .desc(OPT_DESC)
                .build();
	}

	@Override
	public String getValue(CommandLine cmd) {
		return cmd.getOptionValue(OPT_SHORT_DESC, "");
	}
}
