package com.android.example.module06_module201_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.util.AppendOnlyLinkedArrayList<kotlin.Any>
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module06_module321_module10.ClassAAJ = com.android.example.module06_module321_module10.ClassAAJ()
			local_var_3_0.method2("SomeString", "SomeString")

		}
		val local_var_2_2: com.android.example.module06_module321_module10.ClassAAI = com.android.example.module06_module321_module10.ClassAAI()
		local_var_2_2.method3("SomeString")

	}

	fun method1(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module06_module321_module10.ClassAAG = com.android.example.module06_module321_module10.ClassAAG()
		local_var_2_4.method2("SomeString", "SomeString", "SomeString")

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.schedulers.TestScheduler,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}
}
