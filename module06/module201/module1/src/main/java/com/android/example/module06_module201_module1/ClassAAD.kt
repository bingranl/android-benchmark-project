package com.android.example.module06_module201_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module06_module321_module10.ClassAAI = com.android.example.module06_module321_module10.ClassAAI()
		local_var_2_2.method2("SomeString")

		val local_var_2_3: com.android.example.module06_module337_module3.ClassAAH = com.android.example.module06_module337_module3.ClassAAH()
		local_var_2_3.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module06_module342_module3.ClassAAE = com.android.example.module06_module342_module3.ClassAAE()
		local_var_2_1.method4("SomeString", "SomeString", "SomeString")

		val local_var_2_2: com.android.example.module06_module321_module10.ClassAAJ = com.android.example.module06_module321_module10.ClassAAJ()
		local_var_2_2.method0("SomeString")

		val local_var_2_3: com.android.example.module06_module337_module3.ClassAAG = com.android.example.module06_module337_module3.ClassAAG()
		local_var_2_3.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_4: com.android.example.module06_module337_module3.ClassAAC = com.android.example.module06_module337_module3.ClassAAC()
		local_var_2_4.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.schedulers.TestScheduler,
		param3: io.reactivex.internal.queue.SpscLinkedArrayQueue<kotlin.Any>
	) {
		param0.dispose()

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module06_module321_module10.ClassAAH = com.android.example.module06_module321_module10.ClassAAH()
		local_var_2_1.method1("SomeString")

		val local_var_2_2: com.android.example.module06_module337_module3.ClassAAD = com.android.example.module06_module337_module3.ClassAAD()
		local_var_2_2.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.assertNotSubscribed()

		val local_var_2_3: com.android.example.module06_module342_module3.ClassAAI = com.android.example.module06_module342_module3.ClassAAI()
		local_var_2_3.method2("SomeString", "SomeString")

	}
}
