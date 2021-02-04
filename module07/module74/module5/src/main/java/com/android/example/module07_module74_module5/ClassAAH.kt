package com.android.example.module07_module74_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAF = com.android.example.module06_module353_module2.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module353_module1.ClassAAE = com.android.example.module06_module353_module1.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module06_module353_module1.ClassAAH = com.android.example.module06_module353_module1.ClassAAH()
	private 	val instance_var_1_3: com.android.example.module06_module353_module2.ClassAAE = com.android.example.module06_module353_module2.ClassAAE()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAH,
		param1: com.android.example.module06_module353_module1.ClassAAI,
		param2: com.android.example.module06_module353_module2.ClassAAI,
		param3: com.android.example.module06_module353_module2.ClassAAI
	) {
		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.enter()

		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.request(-1018910193635650202)

		}
	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAJ
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isDisposed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(6056326927960020768)

		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.enter()

	}

	fun method2(
		param0: com.android.example.module06_module353_module1.ClassAAI,
		param1: com.android.example.module06_module353_module1.ClassAAB
	) {
		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.enter()

		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.enter()

		param0.method0(com.android.example.module06_module353_module2.ClassAAA())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

	}

	fun method3(
		param0: com.android.example.module06_module353_module1.ClassAAC,
		param1: com.android.example.module06_module353_module2.ClassAAD
	) {
		param0.method3(com.android.example.module06_module353_module2.ClassAAE())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(2377331065946594774)

	}
}
