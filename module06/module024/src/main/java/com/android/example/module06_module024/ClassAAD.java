package com.android.example.module06_module024;

public class ClassAAD {
	private 	java.lang.String instance_var_1_0 = "SomeString";
	private 	java.lang.String instance_var_1_1 = "SomeString";
	private 	java.lang.String instance_var_1_2 = "SomeString";
	private 	java.lang.String instance_var_1_3 = "SomeString";

	public void method0(
		java.lang.String param0,
		java.lang.String param1) throws Throwable {
	}

	public void method1(
		java.lang.String param0,
		java.lang.String param1) throws Throwable {
		for (int iAb = 0; iAb < 0; iAb++) {
			com.google.common.math.PairedStatsAccumulator local_var_3_0 = new com.google.common.math.PairedStatsAccumulator();
			local_var_3_0.populationCovariance();

			com.almworks.sqlite4java.SQLiteProfiler local_var_3_1 = new com.almworks.sqlite4java.SQLiteProfiler();
			local_var_3_1.printReport();

			org.robolectric.shadows.util.SQLiteLibraryLoader local_var_3_2 = new org.robolectric.shadows.util.SQLiteLibraryLoader();
			local_var_3_2.getLibClasspathResourceName();

			org.robolectric.res.PackageResourceTable local_var_3_3 = new org.robolectric.res.PackageResourceTable("SomeString");
			local_var_3_3.getPackageName();

		}
	}
}
