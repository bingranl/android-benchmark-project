package com.android.example.module06_module123_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: okhttp3.ConnectionPool = okhttp3.ConnectionPool()
	private 	val instance_var_1_1: okhttp3.internal.platform.Android10Platform = okhttp3.internal.platform.Android10Platform()
	private 	val instance_var_1_2: okhttp3.internal.publicsuffix.PublicSuffixDatabase = okhttp3.internal.publicsuffix.PublicSuffixDatabase()
	private 	val instance_var_1_3: okhttp3.internal.platform.android.ConscryptSocketAdapter = okhttp3.internal.platform.android.ConscryptSocketAdapter()

	fun method0(
		param0: okhttp3.internal.platform.Android10Platform,
		param1: okhttp3.OkHttpClient,
		param2: okhttp3.Dispatcher,
		param3: okhttp3.internal.publicsuffix.PublicSuffixDatabase
	) {
		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.exit()

		val local_var_2_5: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_5.exit()

		param0.isCleartextTrafficPermitted("SomeString")

		val local_var_2_6: okio.Timeout = okio.Timeout()
		local_var_2_6.deadlineNanoTime(9085798744120068891)

	}

	fun method1(
		param0: okhttp3.internal.publicsuffix.PublicSuffixDatabase
	) {
		val local_var_2_1: okio.Throttler = okio.Throttler()
		local_var_2_1.bytesPerSecond(2859752046853208285, -1879305400363487140, 3547629631666098069)

		param0.getEffectiveTldPlusOne("SomeString")

		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.exit()

	}

	fun method2(
		param0: okhttp3.internal.publicsuffix.PublicSuffixDatabase,
		param1: okhttp3.internal.platform.Android10Platform,
		param2: okhttp3.internal.publicsuffix.PublicSuffixDatabase,
		param3: okhttp3.internal.publicsuffix.PublicSuffixDatabase
	) {
		param0.getEffectiveTldPlusOne("SomeString")

	}
}
