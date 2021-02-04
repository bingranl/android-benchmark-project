package com.android.example.module06_module201_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.schedulers.TestScheduler
	) {
		val local_var_2_4: com.android.example.module06_module337_module3.ClassAAF = com.android.example.module06_module337_module3.ClassAAF()
		local_var_2_4.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber())

		for (iAb in 0..2) {
			val local_var_3_0: com.android.example.module06_module321_module10.ClassAAF = com.android.example.module06_module321_module10.ClassAAF()
			local_var_3_0.method1("SomeString", "SomeString")

		}
		val local_var_2_5: com.android.example.module06_module342_module3.ClassAAA = com.android.example.module06_module342_module3.ClassAAA()
		local_var_2_5.method1("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.schedulers.TestScheduler,
		param2: io.reactivex.disposables.SerialDisposable,
		param3: io.reactivex.internal.schedulers.SingleScheduler
	) {
		val local_var_2_4: com.android.example.module06_module321_module10.ClassAAI = com.android.example.module06_module321_module10.ClassAAI()
		local_var_2_4.method3("SomeString")

		param0.dispose()

		val local_var_2_5: com.android.example.module06_module342_module3.ClassAAH = com.android.example.module06_module342_module3.ClassAAH()
		local_var_2_5.method3("SomeString", "SomeString")

		val local_var_2_6: com.android.example.module06_module321_module10.ClassAAH = com.android.example.module06_module321_module10.ClassAAH()
		local_var_2_6.method4("SomeString", "SomeString", "SomeString", "SomeString")

	}
}
