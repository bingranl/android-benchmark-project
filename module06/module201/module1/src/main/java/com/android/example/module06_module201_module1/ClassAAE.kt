package com.android.example.module06_module201_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			if (kotlin.Any().equals(kotlin.Any())) {
				listOf("1", "2", "3").forEach {
					val local_var_5_0: com.android.example.module06_module342_module3.ClassAAA = com.android.example.module06_module342_module3.ClassAAA()
					local_var_5_0.method1("SomeString", "SomeString", "SomeString")

				}
			}
		} else {
			param0.onError(kotlin.Throwable())

		}
		val local_var_2_1: com.android.example.module06_module337_module3.ClassAAE = com.android.example.module06_module337_module3.ClassAAE()
		local_var_2_1.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.schedulers.TestScheduler(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module06_module337_module3.ClassAAJ = com.android.example.module06_module337_module3.ClassAAJ()
		local_var_2_2.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: com.android.example.module06_module337_module3.ClassAAC = com.android.example.module06_module337_module3.ClassAAC()
		local_var_2_3.method0(io.reactivex.subscribers.TestSubscriber())

		param0.hasSubscription()

		param0.assertNotSubscribed()

	}
}
