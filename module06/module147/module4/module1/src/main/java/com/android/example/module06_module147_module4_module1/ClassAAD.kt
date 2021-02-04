package com.android.example.module06_module147_module4_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module06_module109_module1.ClassAAA = com.android.example.module06_module109_module1.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module109_module1.ClassAAC = com.android.example.module06_module109_module1.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module147_module4_module6.ClassAAH,
		param1: com.android.example.module06_module147_module4_module6.ClassAAJ,
		param2: com.android.example.module06_module147_module4_module6.ClassAAF
	) {
		param0.method2(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_3.get()

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.dispose()

		param0.method2(io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module109_module1.ClassAAC,
		param1: com.android.example.module06_module147_module4_module6.ClassAAD
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

		param0.method0("SomeString")

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onComplete()

	}

	fun method2(
		param0: com.android.example.module06_module147_module4_module6.ClassAAB
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.queue.SpscLinkedArrayQueue(64))

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onComplete()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: com.android.example.module06_module147_module4_module6.ClassAAJ,
		param1: com.android.example.module06_module147_module4_module6.ClassAAI
	) {
	}

	fun method4(
		param0: com.android.example.module06_module147_module4_module6.ClassAAE,
		param1: com.android.example.module06_module147_module4_module6.ClassAAD,
		param2: com.android.example.module06_module109_module1.ClassAAC
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(1831767608894458619)

	}
}
